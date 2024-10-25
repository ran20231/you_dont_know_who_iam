package com.forsale.app.notifications.fcm;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.forsale.app.datalayer.network.entities.ForeSaleFCMMessage;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.leanplum.LeanplumActivityHelper;
import g00.l;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import t9.y0;
import wz.p;
/* compiled from: FCMTopLevelFunctions.kt */
/* loaded from: classes2.dex */
public final class FCMTopLevelFunctionsKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FCMTopLevelFunctions.kt */
    /* loaded from: classes2.dex */
    public static final class a implements OnCanceledListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<String> f37602a;

        /* JADX WARN: Multi-variable type inference failed */
        a(CancellableContinuation<? super String> cancellableContinuation) {
            this.f37602a = cancellableContinuation;
        }

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            CancellableContinuation.DefaultImpls.cancel$default(this.f37602a, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FCMTopLevelFunctions.kt */
    /* loaded from: classes2.dex */
    public static final class b implements OnFailureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<String> f37603a;

        /* JADX WARN: Multi-variable type inference failed */
        b(CancellableContinuation<? super String> cancellableContinuation) {
            this.f37603a = cancellableContinuation;
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception it2) {
            o.i(it2, "it");
            CancellableContinuation<String> cancellableContinuation = this.f37603a;
            Result.a aVar = Result.f61613b;
            cancellableContinuation.resumeWith(Result.b(f.a(it2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FCMTopLevelFunctions.kt */
    /* loaded from: classes2.dex */
    public static final class c implements OnSuccessListener {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f37604a;

        c(l function) {
            o.i(function, "function");
            this.f37604a = function;
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final /* synthetic */ void onSuccess(Object obj) {
            this.f37604a.invoke(obj);
        }
    }

    public static final PendingIntent a(Context ctx, ForeSaleFCMMessage forSaleFCMMessage) {
        CharSequence Z0;
        o.i(ctx, "ctx");
        o.i(forSaleFCMMessage, "forSaleFCMMessage");
        String universalLink = forSaleFCMMessage.getUniversalLink();
        if (universalLink == null) {
            universalLink = ctx.getString(y0.C5);
            o.h(universalLink, "getString(...)");
        }
        Z0 = StringsKt__StringsKt.Z0(universalLink);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Z0.toString()), ctx, MainContainerActivity.class);
        intent.putExtra("SOURCE", "PUSH_NOTIFICATION");
        intent.putExtra(ForeSaleFCMMessage.MID, forSaleFCMMessage.getMessageId());
        intent.setFlags(536870912);
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        return PendingIntent.getActivity(ctx, 0, intent, 201326592);
    }

    public static final void b(Activity activity, String str) {
        Uri uri;
        CharSequence Z0;
        o.i(activity, "activity");
        Intent intent = new Intent(LeanplumActivityHelper.getCurrentActivity(), MainContainerActivity.class);
        intent.setFlags(536870912);
        if (str != null) {
            Z0 = StringsKt__StringsKt.Z0(str);
            String obj = Z0.toString();
            if (obj != null) {
                uri = Uri.parse(obj);
                intent.setData(uri);
                activity.startActivity(intent);
            }
        }
        uri = null;
        intent.setData(uri);
        activity.startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(java.lang.String r1, zz.a<? super java.lang.String> r2) {
        /*
            if (r1 == 0) goto Lb
            boolean r0 = kotlin.text.k.v(r1)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            if (r0 != 0) goto Lf
            goto L10
        Lf:
            r1 = 0
        L10:
            if (r1 != 0) goto L16
            java.lang.Object r1 = d(r2)
        L16:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.notifications.fcm.FCMTopLevelFunctionsKt.c(java.lang.String, zz.a):java.lang.Object");
    }

    public static final Object d(zz.a<? super String> aVar) {
        zz.a d11;
        Object f11;
        d11 = IntrinsicsKt__IntrinsicsJvmKt.d(aVar);
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(d11, 1);
        cancellableContinuationImpl.initCancellability();
        Task<String> r11 = FirebaseMessaging.o().r();
        r11.addOnSuccessListener(new c(new l<String, p>() { // from class: com.forsale.app.notifications.fcm.FCMTopLevelFunctionsKt$retrievePushToken$2$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            public final void b(String str) {
                cancellableContinuationImpl.resumeWith(Result.b(str));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }));
        r11.addOnCanceledListener(new a(cancellableContinuationImpl));
        r11.addOnFailureListener(new b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (result == f11) {
            kotlin.coroutines.jvm.internal.f.c(aVar);
        }
        return result;
    }
}
