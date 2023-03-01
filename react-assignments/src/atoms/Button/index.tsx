import { HTMLAttributes } from "react";


export interface ButtonProps extends HTMLAttributes<HTMLButtonElement>{
    /** Which variant would you like to use*/
    variant?: string;
    /** Content inside the button */
    title:string,

    /**Styles*/
    css?:{},
    makeCss?:string;
}




/** This is a button */
export const Button = ({ variant,title,css,onClick,makeCss}: ButtonProps) => {
    const classes: string = `btn ${variant} ${makeCss}`;
    return <button className={classes} style={css} onClick={onClick}>{title}</button>;
};
