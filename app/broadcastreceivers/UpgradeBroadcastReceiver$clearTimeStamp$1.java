package com.forsale.app.broadcastreceivers;

import com.forsale.app.utils.prefUtils.preferences.MasterDataSharedPrefs;
import com.google.android.gms.maps.model.PinConfig;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: UpgradeBroadcastReceiver.kt */
@d(c = "com.forsale.app.broadcastreceivers.UpgradeBroadcastReceiver$clearTimeStamp$1", f = "UpgradeBroadcastReceiver.kt", l = {36, PinConfig.BITMAP_LENGTH_DP}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UpgradeBroadcastReceiver$clearTimeStamp$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22296a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UpgradeBroadcastReceiver f22297b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeBroadcastReceiver$clearTimeStamp$1(UpgradeBroadcastReceiver upgradeBroadcastReceiver, a<? super UpgradeBroadcastReceiver$clearTimeStamp$1> aVar) {
        super(2, aVar);
        this.f22297b = upgradeBroadcastReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new UpgradeBroadcastReceiver$clearTimeStamp$1(this.f22297b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22296a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            MasterDataSharedPrefs h11 = this.f22297b.c().h();
            this.f22296a = 1;
            if (h11.B("", this) == f11) {
                return f11;
            }
        }
        MasterDataSharedPrefs h12 = this.f22297b.c().h();
        this.f22296a = 2;
        if (h12.A("", this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((UpgradeBroadcastReceiver$clearTimeStamp$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
