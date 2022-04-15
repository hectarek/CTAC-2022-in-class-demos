import "./App.css";

function App() {
	// let [clicks, setClicks] = useState({
	// 	left: 0,
	// 	right: 0,
	// });

	// let handleLeftClick = () => {
	// 	const newClicks = {
	// 		left: clicks.left + 1,
	// 		right: clicks.right,
	// 	};
	// 	setClicks(newClicks);
	// };

	// let handleRightClick = () => {
	// 	const newClicks = {
	// 		left: clicks.left,
	// 		right: clicks.right + 1,
	// 	};
	// 	setClicks(newClicks);
	// };

	// if (clicks.left > 10 || clicks.right > 10) {
	// 	return (
	// 		<div className="App">
	// 			<h1>Wow, that is a lot of clicks</h1>
	// 			<Hello name="Pedro" age={18} />
	// 			{clicks.left}
	// 			<button onClick={handleLeftClick}>left</button>
	// 			<button onClick={handleRightClick}>right</button>
	// 			{clicks.right}
	// 		</div>
	// 	);
	// } else {
	// 	return (
	// 		<div className="App">
	// 			<h1>Click on the buttons below</h1>
	// 			<Hello name="Pedro" age={18} />
	// 			{clicks.left}
	// 			<button onClick={handleLeftClick}>left</button>
	// 			<button onClick={handleRightClick}>right</button>
	// 			{clicks.right}
	// 		</div>
	// 	);
	// }

	const Header = (props) => {
		return <h1>{props.course}</h1>;
	};

	const Part = (props) => {
		return (
			<p>
				{props.part} {props.total}
			</p>
		);
	};

	const Content = () => {
		return (
			<div>
				<Part part={part1.name} total={part1.exercises} />
				<Part part={part2} total={exercises2} />
				<Part part={part3} total={exercises3} />
			</div>
		);
	};
	const Total = () => {
		return <p>Number of exercises {part1.exercises + exercises2 + exercises3}</p>;
	};
	const course = "Half Stack application development";
	const part1 = {
    name: "Fundamentals of React",
    exercises: 10,
  }
	const part2 = "Using props to pass data";
	const exercises2 = 7;
	const part3 = "State of a component";
	const exercises3 = 14;

	return (
		<div>
			<Header course={course} />
			<Content />

			<Total />
		</div>
	);
}

export default App;
