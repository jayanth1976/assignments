export interface ImageProps {
    url: string;
    css?: {};
}

function Image(props: ImageProps) {
    return (
        <div className="image-div" style={props.css}>
            <img className="image card" src={props.url} alt="" />
            <div className="overlay card">An Image</div>
        </div>
    );
}
export default Image;
