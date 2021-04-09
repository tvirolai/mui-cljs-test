import './App.css';
import { Component1, Component2, Component3 } from './demo.js'
import * as ReactIs from "react-is";

console.log(ReactIs.isValidElementType(Component3))

function App() {
  return (
    <div className="App">
      <Component1 />
    </div>
  );
}

export default App;
