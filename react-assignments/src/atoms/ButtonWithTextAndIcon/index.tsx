import React, { HTMLAttributes } from "react";
import { Button } from "@mui/material";

export interface ButtonWithTextAndIconProps
    extends HTMLAttributes<HTMLButtonElement> {
    text: string;
    variant?: "text" | "contained" | "outlined";
    startIcon?: boolean;
    Icon: any;
}

export const ButtonWithTextAndIcon = ({
    variant,
    Icon,
    text,
    startIcon,
}: ButtonWithTextAndIconProps) => {
    if (startIcon) {
        return (
            <Button
                variant={variant}
                startIcon={<Icon />}
                sx={{ textTransform: "none" }}
            >
                {text}
            </Button>
        );
    } else {
        return (
            <Button
                variant={variant}
                endIcon={<Icon />}
                sx={{ textTransform: "none" }}
            >
                {text}
            </Button>
        );
    }
};
