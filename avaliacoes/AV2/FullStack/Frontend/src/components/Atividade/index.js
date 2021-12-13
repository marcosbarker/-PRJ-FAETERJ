import React, { useState, useEffect, useContext } from "react";
import { AiOutlinePlus } from "react-icons/ai";

import "react-loader-spinner/dist/loader/css/react-spinner-loader.css";
import {
  AtividadesContainer,
  AtividadeWrapper,
  AtividadeTitle,
  AtividadeCard,
  AtividadeInfo,
  AtividadeDesc,
  AtividadePrice,
  AtividadeButton,
  ADD,
  Conteudo,
} from "./style";

import api from "../../services/api";
import Modal from "react-bootstrap/Modal";
import "bootstrap/dist/css/bootstrap.min.css";

export function Atividades() {
  const [atividades, setAtividades] = useState([]);
  const [show, setShow] = useState(false);
  const [show1, setShow1] = useState(false);
  const [nomeAtividade, setNomeAtividade] = useState("");
  const [dataAtividade, setDataAtividade] = useState("");
  const [file, setFile] = useState(null);
  const [notaMaxAtividade, setNotaMaxAtividade] = useState();
  const [id, setId] = useState();

  const handleClose = () => setShow(false);
  const handleShow = () => setShow(true);

  const handleClose1 = () => setShow1(false);
  const handleShow1 = (ativ) => {
    setShow1(true);
    setId(ativ);
  };

  useEffect(() => {
    async function fetchData() {
      const produtoResponse = await api.get(`atividades`);
      const atividade = produtoResponse.data;
      setAtividades(atividade);
    }

    fetchData();
  }, [show, show1]);

  async function cadastrarAtividade(e) {
    e.preventDefault();
    const params = {
      nome: nomeAtividade,
      data: dataAtividade,
      notaMax: notaMaxAtividade,
    };

    try {
      await api.post(`atividades`, params);

      handleClose(false);
      alert("success");
    } catch (error) {
      alert("Erro ao cadastrar Atividade", error);
    }
  }
  async function lancarNotas(e) {
    e.preventDefault();

    let formData = new FormData();

    formData.append("file", file);
    console.log(file, formData.values);

    try {
      await api.post(`upload/${id}`, formData, {
        headers: {
          "Content-Type": "multipart/form-data",
        },
      });

      handleClose1(false);
      alert("success");
    } catch (error) {
      alert("Erro ao carregar o arquivo", error);
    }
  }

  return (
    <>
      <Modal show={show} onHide={handleClose}>
        <Modal.Body>
          <Conteudo>
            <div>
              <form onSubmit={cadastrarAtividade}>
                <h1>Cadastrar Atividade</h1>
                <input
                  type="text"
                  value={nomeAtividade}
                  onChange={(e) => setNomeAtividade(e.target.value)}
                  placeholder="Nome"
                />
                <br />
                <input
                  type="date"
                  value={dataAtividade}
                  onChange={(e) => setDataAtividade(e.target.value)}
                  placeholder="Data"
                />
                <br />
                <input
                  type="text"
                  value={notaMaxAtividade}
                  onChange={(e) => setNotaMaxAtividade(e.target.value)}
                  placeholder="Nota máxima"
                />
                <br />
                <button type="submit">Criar Atividade</button>
                <button type="button" onClick={handleClose}>
                  Fechar
                </button>
              </form>
            </div>
          </Conteudo>
        </Modal.Body>
      </Modal>
      <Modal show={show1} onHide={handleClose1}>
        <Modal.Body>
          <Conteudo>
            <div>
              <form onSubmit={lancarNotas}>
                <h1>Cadastrar Atividade</h1>
                <input
                  type="file"
                  onChange={(e) => setFile(e.target.files[0])}
                />
                <br />
                <button type="submit">Lançar Notas</button>
                <button onClick={handleClose1} type="button">
                  Fechar
                </button>
                <button type="button">
                  <a href="https://api-prj.herokuapp.com/files/9ffb7f97-9b86-4579-854f-43e29a588605">
                    Download Modelo
                  </a>
                </button>
              </form>
            </div>
          </Conteudo>
        </Modal.Body>
      </Modal>

      <AtividadesContainer>
        <AtividadeWrapper>
          {atividades.map((atividade) => {
            return (
              <AtividadeCard key={atividade.id}>
                <AtividadeInfo>
                  <AtividadeTitle>{atividade.nome}</AtividadeTitle>
                  <AtividadeDesc>
                    Data de Entrega: {atividade.data}
                  </AtividadeDesc>
                  <AtividadePrice>
                    Nota Máxima: {atividade.notaMax}
                  </AtividadePrice>
                  {atividade.enviado ? (
                    <AtividadeButton disabled={true}>
                      Notas Lançadas
                    </AtividadeButton>
                  ) : (
                    <AtividadeButton onClick={() => handleShow1(atividade.id)}>
                      Lançar notas
                    </AtividadeButton>
                  )}
                </AtividadeInfo>
              </AtividadeCard>
            );
          })}
        </AtividadeWrapper>

        <ADD variant="primary" onClick={handleShow}>
          <AiOutlinePlus />
        </ADD>
      </AtividadesContainer>
    </>
  );
}
