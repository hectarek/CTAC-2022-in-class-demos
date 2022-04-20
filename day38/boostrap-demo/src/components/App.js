import "bootstrap/dist/css/bootstrap.min.css";
import { useState } from "react";
import MyNavBar from "./MyNavBar";
import Icon from "./Icon";
import Container from "react-bootstrap/Container";
import ShoppingList from "./Cart";
import ShoppingCart from "./Cart2";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";

function App() {
	const [userInput, setUserInput] = useState("");

  const handleInput = () =>  {
    console.log(userInput);
  }

  const handleInput2 = () =>  {
    const [inputValue] = document.getElementsByClassName("myInput");
    console.log(inputValue.value);
  }

	return (
		<Container>
			<Row>
				<MyNavBar />
			</Row>
			<Row>
				<Col>some text</Col>
				<Col>
					<Icon icon="alarm" />
					<Icon icon="heart" />
					<Icon icon="hammer" />
					<Icon icon="envelope" />
				</Col>
			</Row>
			<Row>
				<Col>
					<ShoppingList />
				</Col>
			</Row>
			<Row>
				<Col>
					<div>
						<input onChange={(e) => setUserInput(e.target.value)} />
						<button onClick={handleInput}>Input</button>
					</div>
				</Col>
        <Col>
					<div>
						<input className="myInput" onChange={(e) => setUserInput(e.target.value)} />
						<button onClick={handleInput2}>Input2</button>
					</div>
				</Col>
			</Row>
		</Container>
	);
}

export default App;
