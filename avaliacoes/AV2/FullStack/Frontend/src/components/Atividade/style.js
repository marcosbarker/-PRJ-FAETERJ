
import styled from 'styled-components';

export const AtividadesContainer = styled.div`
  /* width: 100vw; */
  min-height: 100vh;
  padding: 5rem calc((100vw - 1300px) / 2);
  background: #ebebeb;
  color: #000;
  
`;

export const AtividadeWrapper = styled.div`
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
  margin: 0 auto;
 
`;

export const AtividadeCard = styled.div`
  margin: 1rem 2rem;
  line-height: 2;
  width: 350px;
  background: #fff;
  padding: 20px;
  border-radius: 20px;  
`;

export const AtividadeImg = styled.img`
  display: flex;
  height: 200px;
  max-width: 100%;
  min-width: auto;
  margin: auto;
  border-radius: 20px;
  
`;



export const AtividadeTitle = styled.h2`
  font-weight: 400;
  font-size: 1.5rem;
`;

export const AtividadeInfo = styled.div`
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  padding: 2rem;
  text-align: center;
`;

export const AtividadeDesc = styled.p`
  margin-bottom: 1rem;
`;

export const AtividadePrice = styled.p`
  margin-bottom: 1rem;
  font-size: 2rem;
`;

export const AtividadeButton = styled.button`
  font-size: 1rem;
  padding: 1rem 4rem;
  border: none;
  background: #52057B;
  color: #fff;
  transition: 0.2 ease-out;
  border-radius: 40px;
  &:hover {
    background: #BC6FF1;
    transition: 0.2s ease-out;
    cursor: pointer;
    color: #52057B;
  }
`;


export const ADD = styled.button`
  border: transparent;
  border-radius: 50%;
  width: 100px;
  height: 100px;
  display: flex;
  justify-content: center;
  align-items: center;
  background: #52057B;
  position: fixed;
  bottom: 9%;
  right: 5%;
  font-size: 150%;
  color: white;
  transition: 0.2 ease-out;
  text-decoration: none;

  

  &:hover{
    background: #BC6FF1;
    transition: 0.2s ease-out;
    cursor: pointer;
    color: #52057B;
  }
  
  
`;
export const Conteudo = styled.div`
  display: flex;
  justify-content: center;
  margin: 0 auto;
  padding: 10px;
  

    form {
        background-color: #fff;
        margin-top: 100px;
        padding: 30px;
        border-radius: 10px;
        align-items:center;
        box-shadow: 0 3px 6px rgba(0,0,0,0.16), 0 3px 6px rgba(0,0,0,0.23);
    }

    form input {
        width: 100%;
        margin: 10px 0;
        border: 0;
        margin-bottom: 10px;
        padding: 6px;
        color: #303030;
    }

    

    form button{
        width: 100%;
        height: 30px;
        background-color: #52057B;
        color: #fff;
        border: 0;
        border-radius: 6px;
        transition: 0.2s;
        box-shadow: 0 3px 6px rgba(0,0,0,0.16), 0 3px 6px rgba(0,0,0,0.23);
        text-align: center;
        margin: 10px 0;
        padding: 5px;
        font-size: 16px;
        font-weight: bold;

        &:hover{
            background-color: #BC6FF1;
            color: #52057B;
        }

}

    form h1{
        color: #BC6FF1;
    }

    button a{
      text-decoration: none;
      color: #ffffff;
    }
  
`;

