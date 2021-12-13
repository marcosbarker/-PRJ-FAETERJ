import React, { useState, useContext, useEffect } from "react";
import { CartContainer, CardCart, CardProdutos,Conteudo, Button } from "./style";
import Modal from "react-bootstrap/Modal";
import "bootstrap/dist/css/bootstrap.min.css";
import api from "../../services/api";

export function Cart() {
  const [notas, setNotas] = useState([]);
  const [matricula, setMatricula] = useState("");
  const [show, setShow] = useState(true);
  
  useEffect(() => {
    async function fetchData() {
      const produtoResponse = await api.get(`alunos/${matricula}`);
      const notaAtividade = produtoResponse.data;
      setNotas(notaAtividade);
    }

    fetchData();
  }, [matricula]);
  const handleClose = () => setShow(false);
  const handleShow = () => setShow(true);
  return (
    <>
      <Modal show={show} onHide={handleClose}>
        <Modal.Body>
          <Conteudo>
            <div>
              <form >
                <h1>Ver Notas Atividades</h1>
                <input
                  type="text"
                  value={matricula}
                  onChange={(e) => setMatricula(e.target.value)}
                  placeholder="Matrícula"
                />
                <br />
               
                <button type="button" onClick={handleClose}>Consultar Notas</button>
                <button type="button" onClick={handleClose}>
                  Fechar
                </button>
              </form>
            </div>
          </Conteudo>
        </Modal.Body>
      </Modal>
      <CartContainer>
        <CardCart>
          <h1>Notas das Atividades</h1>
          {notas.map((notas) => {
            return (
              <div>
                <CardProdutos>
                  Matrícula: {notas.matricula} Nome: {notas.nome} Atividade: {notas.atividade.nome} Nota: {notas.nota}/{notas.atividade.notaMax}
                </CardProdutos>
              </div>
            );
          })}
        </CardCart>
      </CartContainer>
          <Button onClick={handleShow}>Fazer uma nova consulta</Button>
    </>
  );
}
