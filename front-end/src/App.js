import React, {Fragment} from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';

//Compoments
import Create from './Components/Create'
import Read from './Components/Read'
import List from './Components/List'
import Update from './Components/Update'
import Delete from './Components/Delete'
import Header from './Components/Header'

function App() {
  return (
    <div className="container">
      <Fragment><Create/></Fragment>
      <Fragment><Read/></Fragment>
    </div>
    
  );
}

export default App;
