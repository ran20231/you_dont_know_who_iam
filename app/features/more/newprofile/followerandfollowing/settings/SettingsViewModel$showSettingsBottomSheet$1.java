package com.forsale.app.features.more.newprofile.followerandfollowing.settings;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsViewModel.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsViewModel$showSettingsBottomSheet$1", f = "SettingsViewModel.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SettingsViewModel$showSettingsBottomSheet$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32385a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f32386b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f32387c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$showSettingsBottomSheet$1(SettingsViewModel settingsViewModel, boolean z11, a<? super SettingsViewModel$showSettingsBottomSheet$1> aVar) {
        super(2, aVar);
        this.f32386b = settingsViewModel;
        this.f32387c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SettingsViewModel$showSettingsBottomSheet$1(this.f32386b, this.f32387c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = b.f();
        int i11 = this.f32385a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableStateFlow = this.f32386b.f32356i;
            fe.a aVar = new fe.a(this.f32387c);
            this.f32385a = 1;
            if (mutableStateFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SettingsViewModel$showSettingsBottomSheet$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
