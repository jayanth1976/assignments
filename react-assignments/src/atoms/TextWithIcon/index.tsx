import { Typography } from "@mui/material";
import React from "react";

interface TextWithIconProps {
    classMainCon?: string;
    classIcon?: string;
    classText?: string;
    Icon: any;
    text: string;
    variant?:
        | "inherit"
        | "button"
        | "overline"
        | "caption"
        | "h1"
        | "h2"
        | "h3"
        | "h4"
        | "h5"
        | "h6"
        | "subtitle1"
        | "subtitle2"
        | "body1"
        | "body2";
    onClick: any;
}

const TextWithIcon = ({
    Icon,
    text,
    variant,
    classMainCon,
    classIcon,
    classText,
    onClick,
}: TextWithIconProps) => {
    return (
        <div className={classMainCon} onClick={onClick}>
            <Icon className={classIcon} />
            <Typography
                variant={variant ? variant : "subtitle1"}
                className={classText}
            >
                {text}
            </Typography>
        </div>
    );
};

export default TextWithIcon;
