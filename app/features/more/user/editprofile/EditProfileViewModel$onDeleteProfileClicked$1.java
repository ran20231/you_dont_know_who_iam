package com.forsale.app.features.more.user.editprofile;

import com.forsale.app.features.more.user.editprofile.g;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$onDeleteProfileClicked$1", f = "EditProfileViewModel.kt", l = {181, 182}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileViewModel$onDeleteProfileClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33028a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditProfileViewModel f33029b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileViewModel$onDeleteProfileClicked$1(EditProfileViewModel editProfileViewModel, zz.a<? super EditProfileViewModel$onDeleteProfileClicked$1> aVar) {
        super(2, aVar);
        this.f33029b = editProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditProfileViewModel$onDeleteProfileClicked$1(this.f33029b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        ge.a aVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33028a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    this.f33029b.G();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f33029b.A;
            g.c cVar = g.c.f33382a;
            this.f33028a = 1;
            if (mutableStateFlow.emit(cVar, this) == f11) {
                return f11;
            }
        }
        aVar = this.f33029b.f32974g;
        this.f33028a = 2;
        if (aVar.a(this) == f11) {
            return f11;
        }
        this.f33029b.G();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditProfileViewModel$onDeleteProfileClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
