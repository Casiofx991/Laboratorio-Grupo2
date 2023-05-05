using System;
using WebApp;
namespace WebApp
{
	public class Sale
	{
		public Sale()
		{
		}

		public int GetPriceDiscount(int originalPrice, int discount)
		{
			return originalPrice - originalPrice * discount / 100 ;
		}

        public string greet(string name)
        {
			return "Hello," + name;
        }

        public int getMax(int value1)
        {
            return value1;
        }


		public double CalculateDiscountedPrice(double originalPrice, double discount, bool hasDiscount)
        {
            if (hasDiscount)
            {
                double discountAmount = originalPrice * discount / 100;
                return originalPrice - discountAmount;
            }
            else
            {
                return originalPrice;
            }
        }

		public double CalculateFinalPrice(double taxprice, bool hasTax)
        {
            if (hasTax)
            {
                return taxprice + taxprice * TaxConstants.TaxRate;
            }
            else
            {
                return taxprice;
            }
        }

        public double GetFinalPrice(double originalPrice, double discount, bool hasDiscount, bool hasTax)
        {
            double discountedPrice = CalculateDiscountedPrice(originalPrice, discount, hasDiscount);
            return CalculateFinalPrice(discountedPrice, hasTax);
        }

    }
}

