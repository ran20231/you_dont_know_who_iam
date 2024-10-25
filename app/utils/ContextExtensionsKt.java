package com.forsale.app.utils;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import com.forsale.app.datalayer.repositories.ImagesRepository;
import com.forsale.app.notifications.NotificationChannels;
import com.forsale.app.ui.mapcompose.MapOpenMode;
import com.forsale.app.utils.Languages;
import com.forsale.core.util.ContextExtensionKt;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import falcon.chat.entities.Message;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;
import t9.y0;
import zendesk.chat.ChatConfiguration;
import zendesk.chat.ChatEngine;
import zendesk.messaging.MessagingActivity;
/* compiled from: ContextExtensions.kt */
/* loaded from: classes3.dex */
public final class ContextExtensionsKt {

    /* compiled from: ContextExtensions.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39540a;

        static {
            int[] iArr = new int[MapOpenMode.values().length];
            try {
                iArr[MapOpenMode.LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MapOpenMode.DIRECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MapOpenMode.NAVIGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39540a = iArr;
        }
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes3.dex */
    public static final class b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f39541a;

        public b(Context context) {
            this.f39541a = context;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            String packageName = this.f39541a.getPackageName();
            this.f39541a.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + packageName)));
        }
    }

    public static final void A(Context context) {
        kotlin.jvm.internal.o.i(context, "<this>");
        if (e(context)) {
            B(context);
        }
    }

    private static final void B(Context context) {
        MessagingActivity.builder().withEngines(ChatEngine.engine()).show(context, ChatConfiguration.builder().build());
    }

    public static final void C(Context context, LatLng latLng, float f11, MapOpenMode mapOpenMode) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(latLng, "latLng");
        kotlin.jvm.internal.o.i(mapOpenMode, "mapOpenMode");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s(latLng, f11, mapOpenMode)));
        intent.setPackage("com.google.android.apps.maps");
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
        }
    }

    public static /* synthetic */ void D(Context context, LatLng latLng, float f11, MapOpenMode mapOpenMode, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 14.0f;
        }
        if ((i11 & 4) != 0) {
            mapOpenMode = MapOpenMode.DIRECTION;
        }
        C(context, latLng, f11, mapOpenMode);
    }

    public static final void E(Context context) {
        Intent intent;
        kotlin.jvm.internal.o.i(context, "<this>");
        if (Build.VERSION.SDK_INT >= 26) {
            intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.addFlags(268468224);
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addFlags(268468224);
            String packageName = context.getPackageName();
            intent.setData(Uri.parse("package:" + packageName));
        }
        context.startActivity(intent);
    }

    public static final void F(Context context, String fileName) throws IOException {
        boolean N;
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(fileName, "fileName");
        Uri g11 = FileProvider.g(context, "com.forsale.forsale.provider", new File(fileName));
        String uri = g11.toString();
        kotlin.jvm.internal.o.h(uri, "toString(...)");
        String j11 = TypeExtensionsKt.j(uri);
        Intent intent = new Intent("android.intent.action.VIEW");
        N = StringsKt__StringsKt.N(j11, ".pdf", false, 2, null);
        if (N) {
            intent.setDataAndType(g11, "application/pdf");
        } else {
            intent.setDataAndType(g11, "*/*");
        }
        intent.addFlags(1);
        context.startActivity(intent);
    }

    public static final void G(Context context) {
        kotlin.jvm.internal.o.i(context, "<this>");
        try {
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.forsale.forsale")));
            } catch (Exception unused) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.forsale.forsale")));
            }
        } catch (Exception unused2) {
            Toast.makeText(context, y0.Ba, 1).show();
        }
    }

    public static final boolean H(Context context, Bitmap bitmap) {
        OutputStream outputStream;
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(bitmap, "bitmap");
        try {
            String str = System.currentTimeMillis() + ".jpg";
            if (Build.VERSION.SDK_INT >= 29) {
                ContentResolver contentResolver = context.getContentResolver();
                if (contentResolver != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", str);
                    contentValues.put("mime_type", "image/jpg");
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                    contentValues.put("is_pending", (Integer) 1);
                    Uri insert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (insert != null) {
                        outputStream = contentResolver.openOutputStream(insert);
                    } else {
                        outputStream = null;
                    }
                    if (outputStream != null) {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
                        e00.b.a(outputStream, null);
                    }
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    if (insert != null) {
                        contentResolver.update(insert, contentValues, null, null);
                    }
                }
            } else {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getExternalFilesDir(Environment.DIRECTORY_PICTURES), str));
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                e00.b.a(fileOutputStream, null);
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            String message = e11.getMessage();
            if (message != null && f(context)) {
                c.a aVar = new c.a(context);
                aVar.o(y0.M4);
                aVar.h(message);
                aVar.m(context.getString(y0.Z4), new d());
                aVar.d(false);
                aVar.q();
            }
            return false;
        }
    }

    public static final void I(Activity activity, ImagesRepository imagesRepository, String imageUrl) {
        kotlin.jvm.internal.o.i(activity, "<this>");
        kotlin.jvm.internal.o.i(imagesRepository, "imagesRepository");
        kotlin.jvm.internal.o.i(imageUrl, "imageUrl");
        imagesRepository.downloadImageBitmap(imageUrl, new ContextExtensionsKt$saveImageByUrl$1(activity));
    }

    public static final void J(Context context, String phoneNumber, g00.l<? super Exception, wz.p> onFailure) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(phoneNumber, "phoneNumber");
        kotlin.jvm.internal.o.i(onFailure, "onFailure");
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("sms:" + phoneNumber));
            intent.putExtra("exit_on_sent", true);
            context.startActivity(intent);
        } catch (Exception e11) {
            onFailure.invoke(e11);
        }
    }

    public static final void K(Fragment fragment, String phoneNumber, g00.l<? super Exception, wz.p> onFailure) {
        kotlin.jvm.internal.o.i(fragment, "<this>");
        kotlin.jvm.internal.o.i(phoneNumber, "phoneNumber");
        kotlin.jvm.internal.o.i(onFailure, "onFailure");
        try {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("sms:" + phoneNumber));
            intent.putExtra("exit_on_sent", true);
            fragment.startActivity(intent);
        } catch (Exception e11) {
            onFailure.invoke(e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022 A[Catch: all -> 0x001b, TRY_ENTER, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0012, B:13:0x0022, B:15:0x0049, B:14:0x0032), top: B:19:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:4:0x0012, B:13:0x0022, B:15:0x0049, B:14:0x0032), top: B:19:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void L(android.content.Context r3, java.lang.String r4, java.lang.String r5, g00.l<? super java.lang.Throwable, wz.p> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.i(r3, r0)
            java.lang.String r0 = "phoneNumber"
            kotlin.jvm.internal.o.i(r4, r0)
            java.lang.String r0 = "onFailure"
            kotlin.jvm.internal.o.i(r6, r0)
            r0 = 0
            if (r5 == 0) goto L1d
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L19
            goto L1d
        L19:
            r1 = r0
            goto L1e
        L1b:
            r3 = move-exception
            goto L5b
        L1d:
            r1 = 1
        L1e:
            java.lang.String r2 = "https://api.whatsapp.com/send?phone="
            if (r1 == 0) goto L32
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r5.<init>()     // Catch: java.lang.Throwable -> L1b
            r5.append(r2)     // Catch: java.lang.Throwable -> L1b
            r5.append(r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L1b
            goto L49
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b
            r1.<init>()     // Catch: java.lang.Throwable -> L1b
            r1.append(r2)     // Catch: java.lang.Throwable -> L1b
            r1.append(r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = "&text="
            r1.append(r4)     // Catch: java.lang.Throwable -> L1b
            r1.append(r5)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L1b
        L49:
            android.content.Intent r5 = new android.content.Intent     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "android.intent.action.VIEW"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L1b
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L1b
            r5.setData(r4)     // Catch: java.lang.Throwable -> L1b
            r3.startActivity(r5)     // Catch: java.lang.Throwable -> L1b
            goto L78
        L5b:
            java.lang.String r4 = r3.getMessage()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "WhatsApp:: "
            r5.append(r1)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.Object[] r5 = new java.lang.Object[r0]
            x10.a.b(r4, r5)
            r6.invoke(r3)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.ContextExtensionsKt.L(android.content.Context, java.lang.String, java.lang.String, g00.l):void");
    }

    public static /* synthetic */ void M(Context context, String str, String str2, g00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        L(context, str, str2, lVar);
    }

    public static final void N(Context context, String shareDialogTitle, Bitmap imageContent) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(shareDialogTitle, "shareDialogTitle");
        kotlin.jvm.internal.o.i(imageContent, "imageContent");
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            imageContent.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            String str = Environment.getExternalStorageDirectory() + File.separator + context.getString(y0.T) + "_receipt.jpg";
            k(context, byteArrayOutputStream, str);
            wz.p pVar = wz.p.f75480a;
            Q(context, shareDialogTitle, str);
        } catch (IOException e11) {
            e11.printStackTrace();
            String message = e11.getMessage();
            if (message != null && f(context)) {
                c.a aVar = new c.a(context);
                aVar.o(y0.M4);
                aVar.h(message);
                aVar.m(context.getString(y0.Z4), new e());
                aVar.d(false);
                aVar.q();
            }
        }
    }

    public static final void O(final Context context, String imageUrl) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(imageUrl, "imageUrl");
        Intent intent = new Intent();
        intent.setType(Message.IMG);
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(y0.T));
        new ImagesRepository(context).downloadImageBitmap(imageUrl, new g00.l<Bitmap, wz.p>() { // from class: com.forsale.app.utils.ContextExtensionsKt$shareImageByUrl$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(Bitmap bitmap) {
                invoke2(bitmap);
                return wz.p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Bitmap bitmap) {
                if (bitmap != null) {
                    Context context2 = context;
                    String string = context2.getString(bv.o.f16603d);
                    kotlin.jvm.internal.o.h(string, "getString(...)");
                    ContextExtensionsKt.N(context2, string, bitmap);
                }
            }
        });
    }

    public static final void P(Context context, String shareDialogTitle, String contentSharedUri) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(shareDialogTitle, "shareDialogTitle");
        kotlin.jvm.internal.o.i(contentSharedUri, "contentSharedUri");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", "Look at this on 4Sale: " + contentSharedUri);
        context.startActivity(Intent.createChooser(intent, shareDialogTitle));
    }

    private static final void Q(Context context, String str, String str2) {
        Uri g11 = FileProvider.g(context, "com.forsale.forsale.provider", new File(str2));
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(Message.IMG);
        intent.putExtra("android.intent.extra.SUBJECT", context.getString(y0.T));
        intent.putExtra("android.intent.extra.STREAM", g11);
        context.startActivity(Intent.createChooser(intent, str));
    }

    public static final boolean a(Context context, NotificationChannels... channels) {
        NotificationChannel notificationChannel;
        NotificationChannel notificationChannel2;
        int importance;
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(channels, "channels");
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = context.getSystemService("notification");
            kotlin.jvm.internal.o.g(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            int length = channels.length;
            int i11 = 0;
            while (true) {
                boolean z11 = true;
                if (i11 >= length) {
                    return true;
                }
                NotificationChannels notificationChannels = channels[i11];
                notificationChannel = notificationManager.getNotificationChannel(notificationChannels.getId());
                if (notificationChannel != null) {
                    notificationChannel2 = notificationManager.getNotificationChannel(notificationChannels.getId());
                    importance = notificationChannel2.getImportance();
                    if (importance != 0 && c(context)) {
                        z11 = false;
                    }
                }
                if (z11) {
                    return false;
                }
                i11++;
            }
        } else {
            return c(context);
        }
    }

    public static /* synthetic */ boolean b(Context context, NotificationChannels[] notificationChannelsArr, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            notificationChannelsArr = NotificationChannels.values();
        }
        return a(context, notificationChannelsArr);
    }

    private static final boolean c(Context context) {
        Boolean bool;
        NotificationManager notificationManager = (NotificationManager) androidx.core.content.b.getSystemService(context, NotificationManager.class);
        if (notificationManager != null) {
            bool = Boolean.valueOf(notificationManager.areNotificationsEnabled());
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final BitmapDescriptor d(Context context, int i11) {
        kotlin.jvm.internal.o.i(context, "<this>");
        Drawable drawable = androidx.core.content.b.getDrawable(context, i11);
        if (drawable == null) {
            return null;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.o.h(createBitmap, "createBitmap(...)");
        drawable.draw(new Canvas(createBitmap));
        return BitmapDescriptorFactory.fromBitmap(createBitmap);
    }

    private static final boolean e(Context context) {
        if (!Settings.canDrawOverlays(context)) {
            String string = context.getString(y0.f70397c3);
            kotlin.jvm.internal.o.h(string, "getString(...)");
            String string2 = context.getString(y0.f70380b3);
            kotlin.jvm.internal.o.h(string2, "getString(...)");
            int i11 = y0.Z4;
            int i12 = y0.I4;
            if (!f(context)) {
                return false;
            }
            c.a aVar = new c.a(context);
            aVar.p(string);
            aVar.h(string2);
            aVar.m(context.getString(i11), new b(context));
            aVar.j(context.getString(i12), new c());
            aVar.d(false);
            aVar.q();
            return false;
        }
        return true;
    }

    public static final boolean f(Context context) {
        kotlin.jvm.internal.o.i(context, "<this>");
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            return true;
        }
        return false;
    }

    public static final String g(String str) {
        boolean z11;
        String valueOf;
        kotlin.jvm.internal.o.i(str, "<this>");
        if (str.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                Locale locale = Locale.getDefault();
                kotlin.jvm.internal.o.h(locale, "getDefault(...)");
                valueOf = kotlin.text.b.d(charAt, locale);
            } else {
                valueOf = String.valueOf(charAt);
            }
            sb2.append((Object) valueOf);
            String substring = str.substring(1);
            kotlin.jvm.internal.o.h(substring, "substring(...)");
            sb2.append(substring);
            return sb2.toString();
        }
        return str;
    }

    public static final String h(String str) {
        List F0;
        int y11;
        List X0;
        String t02;
        kotlin.jvm.internal.o.i(str, "<this>");
        F0 = StringsKt__StringsKt.F0(str, new String[]{"_", " "}, false, 0, 6, null);
        List<String> list = F0;
        y11 = kotlin.collections.s.y(list, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (String str2 : list) {
            arrayList.add(g(str2));
        }
        X0 = CollectionsKt___CollectionsKt.X0(arrayList);
        t02 = CollectionsKt___CollectionsKt.t0(X0, "", null, null, 0, null, null, 62, null);
        return t02;
    }

    public static final int i(Context context, int i11, int i12) {
        kotlin.jvm.internal.o.i(context, "<this>");
        int color = androidx.core.content.b.getColor(context, i11);
        return Color.argb(i12, Color.red(color), Color.green(color), Color.blue(color));
    }

    public static /* synthetic */ int j(Context context, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = 255;
        }
        return i(context, i11, i12);
    }

    private static final void k(Context context, ByteArrayOutputStream byteArrayOutputStream, String str) {
        File file = new File(str);
        file.createNewFile();
        new FileOutputStream(file).write(byteArrayOutputStream.toByteArray());
    }

    public static final androidx.appcompat.app.d l(Context context) {
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        if (context instanceof androidx.appcompat.app.d) {
            return (androidx.appcompat.app.d) context;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext == null) {
            return null;
        }
        return l(baseContext);
    }

    public static final Languages m(Context context) {
        kotlin.jvm.internal.o.i(context, "<this>");
        String language = context.getResources().getConfiguration().getLocales().get(0).getLanguage();
        Languages.a aVar = Languages.Companion;
        kotlin.jvm.internal.o.f(language);
        return aVar.a(language);
    }

    public static final String n(Context context) {
        kotlin.jvm.internal.o.i(context, "<this>");
        if (kotlin.jvm.internal.o.d(r(context).getValue(), DeviceType.MOBILE.getValue())) {
            return CurrentDeviceType.PHONE.getValue();
        }
        return CurrentDeviceType.TABLET.getValue();
    }

    public static final UiMode o(Context context) {
        Integer num;
        Configuration configuration;
        kotlin.jvm.internal.o.i(context, "<this>");
        Resources resources = context.getResources();
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            num = Integer.valueOf(configuration.uiMode & 48);
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 32) {
            return UiMode.Night;
        }
        return UiMode.Light;
    }

    @SuppressLint({"MissingPermission", "HardwareIds", "SupportAnnotationUsage"})
    public static final String p(Context context) {
        String imei;
        String meid;
        kotlin.jvm.internal.o.i(context, "<this>");
        TelephonyManager telephonyManager = (TelephonyManager) androidx.core.content.b.getSystemService(context, TelephonyManager.class);
        if (telephonyManager != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                imei = telephonyManager.getImei();
                if (imei == null) {
                    meid = telephonyManager.getMeid();
                    return meid;
                }
                return imei;
            }
            return telephonyManager.getDeviceId();
        }
        return null;
    }

    public static final String q(Context context) {
        kotlin.jvm.internal.o.i(context, "<this>");
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        kotlin.jvm.internal.o.h(string, "getString(...)");
        return string;
    }

    public static final DeviceType r(Context context) {
        kotlin.jvm.internal.o.i(context, "<this>");
        if (context.getResources().getBoolean(t9.n0.f69323a)) {
            return DeviceType.TABLET;
        }
        return DeviceType.MOBILE;
    }

    private static final String s(LatLng latLng, float f11, MapOpenMode mapOpenMode) {
        int i11 = a.f39540a[mapOpenMode.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    double d11 = latLng.latitude;
                    double d12 = latLng.longitude;
                    return "google.navigation:q=" + d11 + "," + d12;
                }
                throw new NoWhenBranchMatchedException();
            }
            double d13 = latLng.latitude;
            double d14 = latLng.longitude;
            return "https://www.google.com/maps/dir/?api=1&destination=" + d13 + "," + d14;
        }
        double d15 = latLng.latitude;
        double d16 = latLng.longitude;
        return "geo:" + d15 + "," + d16 + "?z=" + f11 + "&q=" + d15 + "," + d16 + "&dir=" + d15 + "," + d16;
    }

    public static final String t(Context context, String shareLink) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(shareLink, "shareLink");
        kotlin.jvm.internal.w wVar = kotlin.jvm.internal.w.f61809a;
        String string = context.getString(y0.f70527jf);
        kotlin.jvm.internal.o.h(string, "getString(...)");
        String format = String.format(string, Arrays.copyOf(new Object[]{context.getString(y0.f70544kf), shareLink}, 2));
        kotlin.jvm.internal.o.h(format, "format(...)");
        return format;
    }

    public static final boolean u(Context context, String packageName) {
        PackageManager.ApplicationInfoFlags of2;
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(packageName, "packageName");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                of2 = PackageManager.ApplicationInfoFlags.of(0L);
                packageManager.getApplicationInfo(packageName, of2);
            } else {
                context.getPackageManager().getApplicationInfo(packageName, 128);
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static final boolean v(Context context) {
        NetworkInfo activeNetworkInfo;
        kotlin.jvm.internal.o.i(context, "<this>");
        ConnectivityManager connectivityManager = (ConnectivityManager) androidx.core.content.b.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }

    public static final boolean w(Context context) {
        kotlin.jvm.internal.o.i(context, "<this>");
        LocationManager locationManager = (LocationManager) androidx.core.content.b.getSystemService(context, LocationManager.class);
        if (locationManager == null) {
            return false;
        }
        if (!locationManager.isProviderEnabled("gps") && !locationManager.isProviderEnabled("network")) {
            return false;
        }
        return true;
    }

    public static final boolean x(Context context) {
        kotlin.jvm.internal.o.i(context, "<this>");
        if (!u(context, "com.whatsapp") && !u(context, "com.whatsapp.w4b")) {
            return false;
        }
        return true;
    }

    public static final void y(Context context) {
        kotlin.jvm.internal.o.i(context, "<this>");
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }

    public static final void z(final Context context, String phone) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(phone, "phone");
        ContextExtensionKt.a(context, TypeExtensionsKt.c(phone), new g00.l<Exception, wz.p>() { // from class: com.forsale.app.utils.ContextExtensionsKt$openCallIntent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(Exception it2) {
                kotlin.jvm.internal.o.i(it2, "it");
                Context context2 = context;
                String string = context2.getString(y0.Z9);
                kotlin.jvm.internal.o.h(string, "getString(...)");
                if (ContextExtensionsKt.f(context2)) {
                    c.a aVar = new c.a(context2);
                    aVar.o(y0.M4);
                    aVar.h(string);
                    aVar.m(context2.getString(y0.Z4), new a());
                    aVar.d(false);
                    aVar.q();
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(Exception exc) {
                b(exc);
                return wz.p.f75480a;
            }

            /* compiled from: ViewsExtensions.kt */
            /* loaded from: classes3.dex */
            public static final class a implements DialogInterface.OnClickListener {
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                }
            }
        });
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes3.dex */
    public static final class c implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
        }
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes3.dex */
    public static final class d implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
        }
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes3.dex */
    public static final class e implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
        }
    }
}
