package com.forsale.app.features.categories.user.profile;

import com.forsale.app.features.auth.e;
import com.forsale.app.features.auth.login.SignInIntention;
import g00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: UserProfileActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.user.profile.UserProfileActivity$onCreate$1", f = "UserProfileActivity.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class UserProfileActivity$onCreate$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31148a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ UserProfileActivity f31149b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileActivity$onCreate$1(UserProfileActivity userProfileActivity, zz.a<? super UserProfileActivity$onCreate$1> aVar) {
        super(2, aVar);
        this.f31149b = userProfileActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new UserProfileActivity$onCreate$1(this.f31149b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31148a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            SharedFlow<SignInIntention> w02 = this.f31149b.x0().w0();
            final UserProfileActivity userProfileActivity = this.f31149b;
            FlowCollector<SignInIntention> flowCollector = new FlowCollector<SignInIntention>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileActivity$onCreate$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(SignInIntention signInIntention, zz.a<? super wz.p> aVar) {
                    com.forsale.app.features.auth.e M0;
                    M0 = UserProfileActivity.this.M0();
                    e.a.a(M0, signInIntention.getAuthenticationSourcePage(), signInIntention, null, new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.user.profile.UserProfileActivity$onCreate$1$1$emit$2
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }
                    }, 4, null);
                    return wz.p.f75480a;
                }
            };
            this.f31148a = 1;
            if (w02.collect(flowCollector, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((UserProfileActivity$onCreate$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
