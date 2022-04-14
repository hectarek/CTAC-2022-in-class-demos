function Input(props) {
	return (
		<div>
            <label htmlFor="text">{props.label}</label>
            <input type="text" name="text" id="text" />
        </div>
	);
}

export default Input;