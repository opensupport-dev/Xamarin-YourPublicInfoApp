using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

using Android.App;
using Android.Content;
using Android.Gms.Ads;
using Android.Media;
using Android.OS;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Cross_platform_App.Droid;
using YourPublicInfoApp;

[assembly: Xamarin.Forms.Dependency(typeof(InterstitialAdAndroid))]
namespace Cross_platform_App.Droid
{
    class InterstitialAdAndroid : AdListener, IInterstitialAd
    {
        public event EventHandler AdReceived;

        Android.Gms.Ads.InterstitialAd _ad;
        public Context context = Android.App.Application.Context;
        public int prevVolumn = 0;

        public void Show()
        {
            //var context = Android.App.Application.Context;
            Android.Gms.Ads.InterstitialAd ad = new Android.Gms.Ads.InterstitialAd(context);

#if RealId
            ad.AdUnitId = "ca-app-pub-4681470946279796/3704231820"; //Test Id
#else
            ad.AdUnitId = "ca-app-pub-4681470946279796/3704231820";
#endif

            _ad = ad;
            OnAdLoaded();
            ad.AdListener = this;

            var requestbuilder = new AdRequest.Builder();
            ad.LoadAd(requestbuilder.Build());
        }

        public override void OnAdClosed()
        {
            UnMmuteSound();
            AdReceived?.Invoke(this, EventArgs.Empty);
        }

        public override void OnAdLoaded()
        {
            base.OnAdLoaded();
            MuteSound();

            if (_ad.IsLoaded)
                _ad.Show();
        }

        private void UnMmuteSound()
        {
            AudioManager aManager = (AudioManager)context.GetSystemService(Context.AudioService);
#if false
            if (aManager.IsStreamMute(Stream.Music))
            {
                aManager.SetStreamVolume(Stream.Music, prevVolumn, VolumeNotificationFlags.ShowUi);
            }
#endif
            aManager.SetStreamMute(Stream.Music, false);
        }

        private void MuteSound()
        {
            AudioManager aManager = (AudioManager)context.GetSystemService(Context.AudioService);
            prevVolumn = aManager.GetStreamVolume(Stream.Music);
            aManager.SetStreamMute(Stream.Music, true);
        }
    }
}