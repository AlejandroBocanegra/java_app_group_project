import React from 'react';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import Create from './Components/Create'
import Read from './Components/Read'
import List from './Components/List'
import Update from './Components/Update'
import Delete from './Components/Delete'
import Header from './Components/Header'

function App() {
  return (
    <div>
          <Header/>
          <Create/>
          <Read/>
          <List/>
          <Update/>
          <Delete/>
    </div>
  );
}

export default App;
