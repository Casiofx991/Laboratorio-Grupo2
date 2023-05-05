using ClassLibrary1;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System;
using Xunit;


namespace UnitTestProject1
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void Max1()
        {
            MaxNumber maxnumber = new MaxNumber();
            int result = maxnumber.ObtenerMayor(100, 20);


            Assert.Equals(80, result);
        }
        [Fact]
        public void Max2()
        {
            MaxNumber maxnumber = new MaxNumber();
            int result = maxnumber.ObtenerMayor(30, 15);


            Assert.Equals(50, result);
        }
        [Fact]
        public void Max3()
        {
            MaxNumber maxnumber = new MaxNumber();
            int result = maxnumber.ObtenerMayor(50, 10);


            Assert.Equals(10, result);
        }

    }
}

