<%-- 
    Document   : transaksi
    Created on : 12 Jun 2026, 21.53.22
    Author     : Annisa Zahra Zahira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Transaksi Sewa</title>
</head>
<body>

    <h1>Transaksi Sewa</h1>

    <form>
        <table>
            <tr>
                <td>ID Sewa</td>
                <td><input type="text" name="idsewa"></td>
            </tr>

            <tr>
                <td>Customer</td>
                <td><input type="text" name="customer"></td>
            </tr>

            <tr>
                <td>Mobil</td>
                <td><input type="text" name="mobil"></td>
            </tr>

            <tr>
                <td>Tanggal Sewa</td>
                <td><input type="date" name="tgl"></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Simpan"></td>
            </tr>
        </table>
    </form>

</body>
</html>
