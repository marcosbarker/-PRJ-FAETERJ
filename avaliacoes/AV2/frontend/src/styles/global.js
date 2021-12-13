import { createGlobalStyle } from 'styled-components';
import font1 from '../assets/fonts/Roboto-Medium.ttf'

export const GlobalStyle = createGlobalStyle`
    *{
        box-sizing: border-box;
        margin: 0;
        padding: 0;
        @font-face {
            font-family: 'Roboto';
            src: url(${font1}) format('opentype');
        }
        font-family: 'Roboto', sans-serif;
    }
    body{
        background: #ebebeb;
    }
`;