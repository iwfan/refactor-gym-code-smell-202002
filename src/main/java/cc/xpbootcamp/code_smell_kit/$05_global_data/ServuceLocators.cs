using System;

namespace MemberClub.Domain.Common.Utils
{
    public static class ServiceLocator
    {
        public static IServiceProvider Instance { get; set; }
    }
}