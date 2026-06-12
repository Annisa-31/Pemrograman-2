<%-- 
    Document   : pengembalian
    Created on : 12 Jun 2026, 21.53.45
    Author     : Annisa Zahra Zahira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Pengembalian Mobil</title>
</head>
<body>

    <h1>Pengembalian Mobil</h1>

    <form>
        <table>
            <tr>
                <td>ID Sewa</td>
                <td><input type="text" name="idsewa"></td>
            </tr>

            <tr>
                <td>Tanggal Kembali</td>
                <td><input type="date" name="tglkembali"></td>
            </tr>

            <tr>
                <td>Denda</td>
                <td><input type="text" name="denda"></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" value="Simpan"></td>
            </tr>
        </table>
    </form>

</body>
</html>
