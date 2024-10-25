package com.forsale.app.features.more.user.profile;

import com.forsale.app.features.more.user.editprofile.analytics.EditProfileClickedEvent;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$onProfileClick$1", f = "NewProfileViewModel.kt", l = {141, 142}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$onProfileClick$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33623a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33624b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$onProfileClick$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$onProfileClick$1> aVar) {
        super(2, aVar);
        this.f33624b = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$onProfileClick$1(this.f33624b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        com.forsale.app.features.more.user.editprofile.b bVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33623a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f33624b.C;
            m mVar = m.f33702a;
            this.f33623a = 1;
            if (mutableSharedFlow.emit(mVar, this) == f11) {
                return f11;
            }
        }
        bVar = this.f33624b.f33543d;
        EditProfileClickedEvent editProfileClickedEvent = new EditProfileClickedEvent();
        this.f33623a = 2;
        if (bVar.c(editProfileClickedEvent, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$onProfileClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
