import React from "react";

export interface TextFieldProps {
    className?:string;
    type: string;
    placeholder: string;
    min?: string;
    max?: string;
    css?:{}
}
export const TextField = (props: TextFieldProps) => {
    return <input className="inp" style={props.css} {...props} />;
};
