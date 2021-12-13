import { BrowserRouter, Route, Switch } from 'react-router-dom';
import { Home } from './pages/Home';
import { GlobalStyle } from './styles/global';
import { NavBar } from './components/Header'
import { Cart } from './pages/Cart';


import { Footer } from './components/Footer';


function App() {
  return (
    <BrowserRouter>
      <NavBar />
      <GlobalStyle />
      <Switch>
       
          <Route path="/PortalProfessor" exact component={Home} />
          <Route path="/PortalAluno" component={Cart} />
       
        
      </Switch>
      <Footer />
    </BrowserRouter>
  );
}

export default App;
