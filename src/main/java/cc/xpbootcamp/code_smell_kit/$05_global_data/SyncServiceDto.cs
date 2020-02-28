using System;
using MemberClub.Domain.Common.Utils;
using MemberClub.Domain.Services;
using Microsoft.Extensions.DependencyInjection;

namespace MemberClub.Domain.SyncDto
{
    public class SyncDtoWithMetadataBase
    {
        protected SyncDtoWithMetadataBase()
        {
        }

        public static Func<MetadataService> GetMetadataService { get; set; } = () => ServiceLocator.Instance.GetService<MetadataService>();
    }
}