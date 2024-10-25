package com.forsale.app.features.more.user.editprofile.delete;

import com.forsale.designSystem.bottomsheets.ModalBottomSheetState;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import l8.a;
/* compiled from: DeleteAccountBottomSheet.kt */
@d(c = "com.forsale.app.features.more.user.editprofile.delete.DeleteAccountBottomSheetKt$DeleteAccountBottomSheet$1$1$1", f = "DeleteAccountBottomSheet.kt", l = {62, a.f62267d}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DeleteAccountBottomSheetKt$DeleteAccountBottomSheet$1$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33234a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ fe.a f33235b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ModalBottomSheetState f33236c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountBottomSheetKt$DeleteAccountBottomSheet$1$1$1(fe.a aVar, ModalBottomSheetState modalBottomSheetState, zz.a<? super DeleteAccountBottomSheetKt$DeleteAccountBottomSheet$1$1$1> aVar2) {
        super(2, aVar2);
        this.f33235b = aVar;
        this.f33236c = modalBottomSheetState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DeleteAccountBottomSheetKt$DeleteAccountBottomSheet$1$1$1(this.f33235b, this.f33236c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f33234a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            if (this.f33235b.a()) {
                ModalBottomSheetState modalBottomSheetState = this.f33236c;
                this.f33234a = 1;
                if (modalBottomSheetState.Q(this) == f11) {
                    return f11;
                }
            } else {
                ModalBottomSheetState modalBottomSheetState2 = this.f33236c;
                this.f33234a = 2;
                if (modalBottomSheetState2.M(this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((DeleteAccountBottomSheetKt$DeleteAccountBottomSheet$1$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
