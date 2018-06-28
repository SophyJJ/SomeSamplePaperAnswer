using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace Question2.Models
{
    public class Receipt
    {
        string shop;
        string receipt_sn;
        double amount;

        public string Shop { get { return shop; } }
        public string Receipt_Sn { get { return receipt_sn;  } }
        public double Amount {  get { return amount;  } }

        public Receipt(string receipt_sn, string shop, double amount)
        {
            this.receipt_sn = receipt_sn;
            this.shop = shop;
            this.amount = amount;
        }
    }
}