using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;
using Question2.Models;
using System.Collections;

namespace Question2
{
    public partial class WebForm1 : System.Web.UI.Page
    {    
        protected void Page_Load(object sender, EventArgs e)
        {
        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            /* Question 2a)           
             * TextBox2 is for Receipt s/n
             * TextBox3 is for Shop name
             * TextBox4 is for Amount
             */

            string shopName = TextBox3.Text;
            string receiptSn = TextBox2.Text;
            double amount = double.Parse(TextBox4.Text);
            Receipt receipt = new Receipt(receiptSn, shopName, amount);
            ArrayList receiptList = Session["receiptList"] == null ? new ArrayList() : (ArrayList)Session["receiptList"];
            receiptList.Add(receipt);
            Session["receiptList"] = receiptList;
            GridView1.DataSource = receiptList;
            GridView1.DataBind();
        }

        protected void Button2_Click(object sender, EventArgs e)
        {
            /* Question 2c) 
             * TextBox1 is for Vehicle number
             */            
            ArrayList receiptList = (ArrayList)Session["receiptList"];
            string vehicleNumber = TextBox1.Text;           
            applyRebates(vehicleNumber, receiptList);
        }

        /// <summary>
        /// This is a dummy code, pretend to update the non-existant database
        /// When call, it will display a message saying Database updated successfully.
        /// </summary>
        /// <param name="vehicle"></param>
        /// <param name="receipts"></param>
        void applyRebates(string vehicle, ArrayList receipts)
        {
            LabelX.Text = "Database Updated Successfully!";
        }

        double findExistingRebates(string vehicles)
        {
            // Question 2d)

            // a) Add a Button component for user to select retrieve rebate amount
            // b) User will trigger the Button event handler (eg Button3_Click)
            // c) Button3_Click will call the method findExistingRebates, passing in the vehicle number as parameter
            // d) Query the database for rebate based on vehicle number
            // e) Calculate the rebate
            // f) return the rebate value
            // g) Convert the double value to string using ToString() method and assign it to a Label component to display the rebate amount.
            return 0;
        }
    }
}