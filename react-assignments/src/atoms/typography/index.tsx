import { Typography as MuiTypography, TypographyProps } from "@mui/material";
import React, { ReactNode } from "react";

export interface TypographyCompProps extends TypographyProps {
    children: ReactNode;
    variant:
        | "body1"
        | "body2"
        | "button"
        | "caption"
        | "h1"
        | "h2"
        | "h3"
        | "h4"
        | "h5"
        | "h6"
        | "inherit"
        | "overline"
        | "subtitle1"
        | "subtitle2";
}
const Typography = ({ children, variant, ...props }: TypographyCompProps) => {
    return (
        <MuiTypography
            variant={variant}
            {...props}
            data-testid="typography component"
        >
            {children}
        </MuiTypography>
    );
};

export default Typography;
