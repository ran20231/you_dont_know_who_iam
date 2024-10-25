package com.forsale.app.features.more.newprofile.followerandfollowing.settings;

import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: SettingsBottomSheet.kt */
@d(c = "com.forsale.app.features.more.newprofile.followerandfollowing.settings.SettingsBottomSheetKt$SettingsBottomSheet$1$1$1", f = "SettingsBottomSheet.kt", l = {55, 56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SettingsBottomSheetKt$SettingsBottomSheet$1$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32326a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ fe.a f32327b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f32328c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsBottomSheetKt$SettingsBottomSheet$1$1$1(fe.a aVar, ModalBottomSheetState modalBottomSheetState, a<? super SettingsBottomSheetKt$SettingsBottomSheet$1$1$1> aVar2) {
        super(2, aVar2);
        this.f32327b = aVar;
        this.f32328c = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SettingsBottomSheetKt$SettingsBottomSheet$1$1$1(this.f32327b, this.f32328c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f32326a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (this.f32327b.a()) {
                ModalBottomSheetState modalBottomSheetState = this.f32328c;
                this.f32326a = 1;
                if (modalBottomSheetState.Q(this) == f11) {
                    return f11;
                }
            } else {
                ModalBottomSheetState modalBottomSheetState2 = this.f32328c;
                this.f32326a = 2;
                if (modalBottomSheetState2.M(this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SettingsBottomSheetKt$SettingsBottomSheet$1$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
