import React from "react";
import { Checkbox } from "../../atoms/Checkbox";

interface StatusProps {
    handleUpdate: any;
}

const checkboxStyles = {
    fontWeight: "400",
    fontSize: "12px",
    lineHeight: "18px",
    height: "24px",
    display: "flex",
    alignItems: "center",
    marginLeft: "19px",
    marginBottom: "12px",
};

const Status = ({ handleUpdate }: StatusProps) => {
    const statusItems = ["All status", "Clear", "Consider"];
    return (
        <div>
            {statusItems.map((item, idx) => (
                <Checkbox
                    name={item}
                    id={(idx + 1).toString()}
                    text={item}
                    css={checkboxStyles}
                    handleClick={handleUpdate}
                />
            ))}
        </div>
    );
};

export default Status;
