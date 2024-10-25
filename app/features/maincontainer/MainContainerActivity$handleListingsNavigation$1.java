package com.forsale.app.features.maincontainer;

import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.categories.listings.ListingsTypes;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$handleListingsNavigation$1", f = "MainContainerActivity.kt", l = {935, 939, 943}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerActivity$handleListingsNavigation$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31357a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingsTypes f31358b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31359c;

    /* compiled from: MainContainerActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31363a;

        static {
            int[] iArr = new int[ListingsTypes.values().length];
            try {
                iArr[ListingsTypes.MY_LISTINGS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListingsTypes.MY_FAVORITES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ListingsTypes.WANTED_ITEMS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31363a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$handleListingsNavigation$1(ListingsTypes listingsTypes, MainContainerActivity mainContainerActivity, zz.a<? super MainContainerActivity$handleListingsNavigation$1> aVar) {
        super(2, aVar);
        this.f31358b = listingsTypes;
        this.f31359c = mainContainerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerActivity$handleListingsNavigation$1(this.f31358b, this.f31359c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        int i11;
        Object f12;
        Object f13;
        Object f14;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i12 = this.f31357a;
        if (i12 != 0) {
            if (i12 == 1 || i12 == 2 || i12 == 3) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            ListingsTypes listingsTypes = this.f31358b;
            if (listingsTypes == null) {
                i11 = -1;
            } else {
                i11 = a.f31363a[listingsTypes.ordinal()];
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        final MainContainerActivity mainContainerActivity = this.f31359c;
                        SignInIntention signInIntention = SignInIntention.DEFAULT;
                        g00.a<wz.p> aVar = new g00.a<wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$handleListingsNavigation$1.3
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
                                MainContainerActivity.this.V();
                            }
                        };
                        this.f31357a = 3;
                        f14 = mainContainerActivity.f1(signInIntention, aVar, this);
                        if (f14 == f11) {
                            return f11;
                        }
                    }
                } else {
                    final MainContainerActivity mainContainerActivity2 = this.f31359c;
                    SignInIntention signInIntention2 = SignInIntention.FAVORITE_FROM_DEEPLINK;
                    g00.a<wz.p> aVar2 = new g00.a<wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$handleListingsNavigation$1.2
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
                            MainContainerActivity.this.Y();
                        }
                    };
                    this.f31357a = 2;
                    f13 = mainContainerActivity2.f1(signInIntention2, aVar2, this);
                    if (f13 == f11) {
                        return f11;
                    }
                }
            } else {
                final MainContainerActivity mainContainerActivity3 = this.f31359c;
                SignInIntention signInIntention3 = SignInIntention.MY_LISTINGS_FROM_DEEPLINK;
                g00.a<wz.p> aVar3 = new g00.a<wz.p>() { // from class: com.forsale.app.features.maincontainer.MainContainerActivity$handleListingsNavigation$1.1
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
                        MainContainerActivity.this.L();
                    }
                };
                this.f31357a = 1;
                f12 = mainContainerActivity3.f1(signInIntention3, aVar3, this);
                if (f12 == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerActivity$handleListingsNavigation$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
