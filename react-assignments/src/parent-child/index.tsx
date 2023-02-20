import React from "react";
import { makeStyles } from "@mui/styles";
import { TextField } from "../atoms/TextField";
import { VisibilityOffOutlined } from "@mui/icons-material";
import { Checkbox } from "../atoms/Checkbox";
import "../index.css";
import { Button } from "../atoms/Button";
import theme from "../Theme";
import { Typography } from "@mui/material";
import styled from "styled-components";

const Wrapper = styled.div`
    width: 35.13%;
    height: 87.5%;
    min-height: 672px;
    min-width: 380px;
    border-radius: 6px;
    box-shadow: 0px 4px 28px rgba(45, 45, 47, 0.1);

    & .subCon {
        margin: 2rem 2.375rem;
        padding: 0.5rem;
    }
    & .subTitle {
        margin-top: 8px !important;
    }
    & .inpGrp {
        margin-top: 24px;
        display: flex;
        flex-direction: column;
        position: relative;
    }
    & .input {
        height: 36px;
        padding: 0.25rem 0.5rem;
        border: 1px solid ${theme.palette.grey[50]};
        border-radius: 0.25rem;
        & :focus {
            outline: 1px solid hsla(201, 100%, 50%, 0.5);
        }
        font-size: 14px;
    }
    & .label {
        color: ${theme.palette.grey[100]};
        font-size: 12px;
        font-weight: 500;
        margin-bottom: 10px;
        text-transform: capitalize;
    }
`;

const useStyles = makeStyles({
    mainCon: {
        width: "35.13%",
        height: "87.5%",
        minHeight: "672px",
        minWidth: "380px",
        borderRadius: "6px",
        boxShadow: "0px 4px 28px rgba(45, 45, 47, 0.1)",
    },
    subCon: {
        margin: "2rem 2.375rem",
        padding: "0.5rem",
    },
    subTitle: {
        marginTop: "8px",
        color: "aqua",
    },
    inpGrp: {
        marginTop: "24px",
        display: "flex",
        flexDirection: "column",
        position: "relative",
    },
    input: {
        height: "36px",
        // height:'1.2%',
        padding: "0.25rem 0.5rem",
        border: `1px solid ${theme.palette.grey[50]}`,
        borderRadius: "0.25rem",
        "&:focus": {
            outline: "1px solid hsla(201,100%,50%,0.5)",
        },
        fontSize: "14px",
    },
    label: {
        color: theme.palette.grey[100],
        fontSize: "12px",
        fontWeight: "500",
        marginBottom: "10px",
        textTransform: "capitalize",
    },
    icon: {
        color: theme.palette.grey[200],
        position: "absolute",
        top: "53%",
        left: "92%",
    },
    forgotPassCon: {
        marginTop: "22px",
        fontSize: "14px",
        color: theme.palette.grey[100],
        height: "36px",
        display: "flex",
        alignItems: "center",
        justifyContent: "space-between",
    },
    forPass: {
        fontWeight: "500",
        color: theme.palette.primary.main,
        cursor: "pointer",
    },
    ruler: {
        marginTop: "24px",
        position: "relative",
        marginBottom: "24px",
        "& span": {
            // display:'block',
            width: "3%",
            marginLeft: "48%",
            textAlign: "center",
            background: "white",
        },
        "& ::before": {
            content: "''",
            zIndex: "-10",
            borderTop: `1px solid ${theme.palette.grey[50]}`,
            width: "100%",
            top: "50%",
            height: "1px",
            position: "absolute",
            left: "1%",
        },
    },
    google: {
        height: "48px",
        fontSize: "14px",
        display: "flex",
        justifyContent: "center",
        alignItems: "center",
        border: `1px solid ${theme.palette.grey[50]}`,
        borderRadius: "4px",
        marginBottom: "16px",
        "& p": {
            paddingBottom: "5px",
            marginLeft: "8px",
        },
        cursor: "pointer",
    },
    signUp: {
        textAlign: "center",
        marginTop: "24px",
        "& span": {
            color: theme.palette.primary.main,
            cursor: "pointer",
        },
    },
    btn: {
        width: "100%",
        marginTop: "26px",
        height: "44px",
        borderRadius: "6px",
        background: theme.palette.primary.main,
        color: "white",
        border: "none",
    },
});

const SignIn = () => {
    // const content = ["password", "confirm password"];
    const classes = useStyles();
    return (
        <Wrapper>
            <div className="subCon">
                <Typography variant="h3">Sign in</Typography>
                <Typography variant="subtitle2" className="subTitle">
                    Please enter your login credentials
                </Typography>
                <div className="inpGrp">
                    <label className="label">Email</label>
                    <TextField
                        className="input"
                        type="email"
                        placeholder="Email"
                    />
                </div>
                <div className="inpGrp">
                    <label className="label">Password</label>
                    <TextField
                        className="input"
                        type="password"
                        placeholder="password"
                    />
                    <VisibilityOffOutlined className={classes.icon} />
                </div>
                <div className={classes.forgotPassCon}>
                    <Checkbox
                        name="remember me"
                        id="remember me"
                        text="Remember me"
                    />
                    <p className={classes.forPass}>Forgot password?</p>
                </div>
                <Button title="Sign in" makeCss={classes.btn} />
                <div className={classes.ruler}>
                    <span>or</span>
                </div>
                <div className={classes.google}>
                    <img src="images/google.svg" alt="google logo" />
                    <p>Sign with google</p>
                </div>
                <div className={classes.google}>
                    <img src="images/github.svg" alt="github logo" />
                    <p>Sign with Github</p>
                </div>
                <Typography
                    variant="subtitle2"
                    className={`${classes.subTitle} ${classes.signUp}`}
                >
                    Don't have an account? <span>Sign up</span>
                </Typography>
            </div>
        </Wrapper>
    );
};

export default SignIn;
