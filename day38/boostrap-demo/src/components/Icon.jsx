import "bootstrap-icons/font/bootstrap-icons.css";

function Icon (props) {
    let iconName = `bi bi-${props.icon}`
    return (
        <i className={iconName}></i>
    )
}

export default Icon;