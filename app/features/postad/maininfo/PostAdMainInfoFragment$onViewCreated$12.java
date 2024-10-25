package com.forsale.app.features.postad.maininfo;

import com.forsale.app.ui.bottomsheets.postadwarning.PostAdWarningBottomSheet;
import g00.l;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: PostAdMainInfoFragment.kt */
@d(c = "com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$onViewCreated$12", f = "PostAdMainInfoFragment.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdMainInfoFragment$onViewCreated$12 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35820a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdMainInfoFragment f35821b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdMainInfoFragment.kt */
    @d(c = "com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$onViewCreated$12$1", f = "PostAdMainInfoFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment$onViewCreated$12$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Pair<? extends String, ? extends Boolean>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35822a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35823b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdMainInfoFragment f35824c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdMainInfoFragment postAdMainInfoFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35824c = postAdMainInfoFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Pair<String, Boolean> pair, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pair, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35824c, aVar);
            anonymousClass1.f35823b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35822a == 0) {
                f.b(obj);
                Pair pair = (Pair) this.f35823b;
                if (pair != null) {
                    final PostAdMainInfoFragment postAdMainInfoFragment = this.f35824c;
                    PostAdWarningBottomSheet.B.a(13, ((Boolean) pair.d()).booleanValue(), (String) pair.c(), new g00.p<Integer, String, p>() { // from class: com.forsale.app.features.postad.maininfo.PostAdMainInfoFragment.onViewCreated.12.1.1
                        {
                            super(2);
                        }

                        public final void b(int i11, String phone) {
                            o.i(phone, "phone");
                            PostAdMainInfoFragment.this.T().m4(i11, phone);
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(Integer num, String str) {
                            b(num.intValue(), str);
                            return p.f75480a;
                        }
                    }).show(this.f35824c.getChildFragmentManager(), "POST_AD_PHONES_BOTTOMSHEET_WARNING");
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMainInfoFragment$onViewCreated$12(PostAdMainInfoFragment postAdMainInfoFragment, zz.a<? super PostAdMainInfoFragment$onViewCreated$12> aVar) {
        super(1, aVar);
        this.f35821b = postAdMainInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdMainInfoFragment$onViewCreated$12(this.f35821b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35820a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Pair<String, Boolean>> N0 = this.f35821b.B().N0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35821b, null);
            this.f35820a = 1;
            if (FlowKt.collectLatest(N0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdMainInfoFragment$onViewCreated$12) create(aVar)).invokeSuspend(p.f75480a);
    }
}
