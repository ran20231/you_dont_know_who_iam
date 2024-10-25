package com.forsale.app.features.more.newprofile.followerandfollowing.settings;

import com.forsale.app.feedback.a;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import rj.a;
import t9.q0;
import t9.y0;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsViewModel.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$handle$1", f = "SettingsViewModel.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SettingsViewModel$handle$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32372a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f32373b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$handle$1(SettingsViewModel settingsViewModel, a<? super SettingsViewModel$handle$1> aVar) {
        super(2, aVar);
        this.f32373b = settingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SettingsViewModel$handle$1(this.f32373b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f32372a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f32373b.f32354g;
            lf.a aVar = new lf.a(new a.b(q0.C), new a.b(y0.Y, new Object[0]));
            this.f32372a = 1;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SettingsViewModel$handle$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
