import "../styles/App.css";

import Greeting from "./Greeting"
import Heading from "./Heading";
import Footer from "./Footer";
import Form from "./form/Form";

const name = 2389576;

function App() {
	return (
		<div className="App">
			<Heading />
			<Greeting name="Bob"/>
			<Form label="My Text" buttonText="Click Me"/>
			<Footer />
			{name}
		</div>
	);
}

export default App;
