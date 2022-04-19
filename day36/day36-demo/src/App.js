import {useState, useEffect} from 'react'; 

function App() {

  let [count, setCounter] = useState(0);
  let [numbers, setNumbers] = useState(
    [1,2,3,4,5,1]
  );

  useEffect(() => {
    return () => {
      alert('Hey, this pops up when numbers hasnt changed')
    }
  }, []);
  
  let addFun = () => {
    setCounter(count++);
    let ex = numbers.push(count);
    setNumbers(ex);

  }

  let listItems = numbers.map((num, index) => {
    return (<li key={index}>
      {num}
    </li>)
  })
  console.log(listItems[3])
  return (
    <div className="App">
      {listItems}
      <button onClick={addFun}>Click</button>
    </div>
  );
}

export default App;
