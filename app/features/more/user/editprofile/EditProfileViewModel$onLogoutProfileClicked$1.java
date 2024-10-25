package com.forsale.app.features.more.user.editprofile;

import com.forsale.app.datalayer.network.responses.RequestCompleted;
import com.forsale.app.features.more.user.editprofile.g;
import com.forsale.app.ui.bottomsheets.logout.interactors.LogoutInteractor;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.editprofile.EditProfileViewModel$onLogoutProfileClicked$1", f = "EditProfileViewModel.kt", l = {204, 205}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class EditProfileViewModel$onLogoutProfileClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33030a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EditProfileViewModel f33031b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f33032c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditProfileViewModel$onLogoutProfileClicked$1(EditProfileViewModel editProfileViewModel, boolean z11, zz.a<? super EditProfileViewModel$onLogoutProfileClicked$1> aVar) {
        super(2, aVar);
        this.f33031b = editProfileViewModel;
        this.f33032c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new EditProfileViewModel$onLogoutProfileClicked$1(this.f33031b, this.f33032c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        LogoutInteractor logoutInteractor;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33030a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    this.f33031b.H(((RequestCompleted) obj).getMessage());
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f33031b.A;
            g.c cVar = g.c.f33382a;
            this.f33030a = 1;
            if (mutableStateFlow.emit(cVar, this) == f11) {
                return f11;
            }
        }
        logoutInteractor = this.f33031b.f32975h;
        boolean z11 = this.f33032c;
        this.f33030a = 2;
        obj = logoutInteractor.c(z11, this);
        if (obj == f11) {
            return f11;
        }
        this.f33031b.H(((RequestCompleted) obj).getMessage());
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((EditProfileViewModel$onLogoutProfileClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
