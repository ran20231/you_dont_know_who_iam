package com.forsale.app.features.more.user.profile;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$onMessagesClick$1", f = "NewProfileViewModel.kt", l = {185, 185}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$onMessagesClick$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f33612a;

    /* renamed from: b  reason: collision with root package name */
    int f33613b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33614c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$onMessagesClick$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$onMessagesClick$1> aVar) {
        super(2, aVar);
        this.f33614c = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$onMessagesClick$1(this.f33614c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33613b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableSharedFlow = (MutableSharedFlow) this.f33612a;
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f33614c.C;
            NewProfileViewModel newProfileViewModel = this.f33614c;
            this.f33612a = mutableSharedFlow;
            this.f33613b = 1;
            obj = newProfileViewModel.K(this);
            if (obj == f11) {
                return f11;
            }
        }
        x xVar = new x(!((Boolean) obj).booleanValue());
        this.f33612a = null;
        this.f33613b = 2;
        if (mutableSharedFlow.emit(xVar, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$onMessagesClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
