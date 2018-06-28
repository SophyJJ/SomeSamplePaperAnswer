<%@ Page Language="C#" AutoEventWireup="true" CodeBehind="WebForm1.aspx.cs" Inherits="Question2.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
    <div>
        <b>Parking Rebate system</b><br />
        Vehicle Number: <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <p></p>
        <b>Enter receipt informationn</b><br />
        Receipt s/n: <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox><br />
        Shop name: <asp:TextBox ID="TextBox3" runat="server"></asp:TextBox><br />
        Amount: <asp:TextBox ID="TextBox4" runat="server"></asp:TextBox><br />
        <asp:Button ID="Button1" runat="server" Text="Add Receipt" OnClick="Button1_Click" /><br />
        <asp:GridView ID="GridView1" runat="server"></asp:GridView>
        <asp:Button ID="Button2" runat="server" Text="Apply Rebate" OnClick="Button2_Click" /><br />
        <asp:Label ID="LabelX" runat="server" ForeColor="Red" ></asp:Label>
    </div>
    </form>
</body>
</html>
