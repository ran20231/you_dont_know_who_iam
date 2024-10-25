package com.forsale.app.features.more.user.profile;

import androidx.lifecycle.r0;
import com.forsale.app.datalayer.database.UserEntity;
import com.forsale.app.datalayer.repositories.UserRepository;
import com.forsale.app.features.auth.utils.AuthErrorHandler;
import com.forsale.app.features.auth.utils.AuthServerErrorsState;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import com.forsale.app.utils.prefUtils.preferences.UserSharedPref;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$refreshSession$1", f = "NewProfileViewModel.kt", l = {FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$refreshSession$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33639a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33640b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$refreshSession$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$refreshSession$1> aVar) {
        super(2, aVar);
        this.f33640b = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$refreshSession$1(this.f33640b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AuthErrorHandler authErrorHandler;
        UserProfileInteractor userProfileInteractor;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33639a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                userProfileInteractor = this.f33640b.f33541b;
                CoroutineScope a11 = r0.a(this.f33640b);
                this.f33639a = 1;
                if (UserProfileInteractor.o(userProfileInteractor, a11, false, this, 2, null) == f11) {
                    return f11;
                }
            }
        } catch (Exception e11) {
            authErrorHandler = this.f33640b.f33549j;
            final NewProfileViewModel newProfileViewModel = this.f33640b;
            authErrorHandler.a(new g00.l<bj.c, wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileViewModel$refreshSession$1.1
                {
                    super(1);
                }

                public final void b(bj.c it2) {
                    kotlin.jvm.internal.o.i(it2, "it");
                    AuthServerErrorsState.a aVar = AuthServerErrorsState.f22915b;
                    final NewProfileViewModel newProfileViewModel2 = NewProfileViewModel.this;
                    aVar.a(it2, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileViewModel.refreshSession.1.1.1

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: NewProfileViewModel.kt */
                        @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$refreshSession$1$1$1$1", f = "NewProfileViewModel.kt", l = {112, 113}, m = "invokeSuspend")
                        /* renamed from: com.forsale.app.features.more.user.profile.NewProfileViewModel$refreshSession$1$1$1$1  reason: invalid class name and collision with other inner class name */
                        /* loaded from: classes2.dex */
                        public static final class C03661 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

                            /* renamed from: a  reason: collision with root package name */
                            int f33643a;

                            /* renamed from: b  reason: collision with root package name */
                            final /* synthetic */ NewProfileViewModel f33644b;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C03661(NewProfileViewModel newProfileViewModel, zz.a<? super C03661> aVar) {
                                super(2, aVar);
                                this.f33644b = newProfileViewModel;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                                return new C03661(this.f33644b, aVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                Object f11;
                                jj.b bVar;
                                UserRepository userRepository;
                                f11 = kotlin.coroutines.intrinsics.b.f();
                                int i11 = this.f33643a;
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
                                    bVar = this.f33644b.f33547h;
                                    UserSharedPref l11 = bVar.l();
                                    this.f33643a = 1;
                                    if (l11.f(this) == f11) {
                                        return f11;
                                    }
                                }
                                userRepository = this.f33644b.f33540a;
                                UserEntity userEntity = new UserEntity(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
                                this.f33643a = 2;
                                if (userRepository.updateCachedUser(userEntity, this) == f11) {
                                    return f11;
                                }
                                return wz.p.f75480a;
                            }

                            @Override // g00.p
                            public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                                return ((C03661) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
                            }
                        }

                        {
                            super(0);
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            BuildersKt__Builders_commonKt.launch$default(r0.a(NewProfileViewModel.this), null, null, new C03661(NewProfileViewModel.this, null), 3, null);
                        }
                    }, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileViewModel.refreshSession.1.1.2
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }
                    }, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.user.profile.NewProfileViewModel.refreshSession.1.1.3
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // g00.a
                        public /* bridge */ /* synthetic */ wz.p invoke() {
                            invoke2();
                            return wz.p.f75480a;
                        }
                    });
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(bj.c cVar) {
                    b(cVar);
                    return wz.p.f75480a;
                }
            }).b(e11);
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$refreshSession$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
