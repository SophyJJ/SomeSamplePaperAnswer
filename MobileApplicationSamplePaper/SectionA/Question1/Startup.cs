using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(Question1.Startup))]
namespace Question1
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
