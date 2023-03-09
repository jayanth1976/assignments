import React from "react";

interface TableContentProps {
    rowClass?: string;
    considerClass?: string;
    clearClass?: string;
    data: any;
    reload: any;
}

interface itemProps {
    id: string;
    name: string;
    adjudication: string;
    status: string;
    location: string;
    date: string;
}

const TableContent = ({
    rowClass,
    considerClass,
    clearClass,
    data,
    reload,
}: TableContentProps) => {
    return (
        <>
            {data.map((item: itemProps) => {
                return (
                    <tr className={rowClass} key={item.id}>
                        <td>{item.name}</td>
                        <td> - </td>
                        <td>
                            <span
                                className={
                                    item.status === "CONSIDER"
                                        ? considerClass
                                        : clearClass
                                }
                            >
                                {item.status}
                            </span>
                        </td>
                        <td>{item.location}</td>
                        <td>{item.date}</td>
                    </tr>
                );
            })}
        </>
    );
};

export default TableContent;
