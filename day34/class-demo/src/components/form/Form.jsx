import Button from "./Button";
import Input from "./Input";

function Form(props) {
	return (
		<form>
            <Input label={props.label}/>
            <Button buttonText={props.buttonText}/>
        </form>
	);
}

export default Form;