package com.forsale.app.features.postad.extraattributes;

import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItem;
import com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel;
import g00.l;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: PostAdAttributesFragment.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment$onViewCreated$1", f = "PostAdAttributesFragment.kt", l = {57}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PostAdAttributesFragment$onViewCreated$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35096a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdAttributesFragment f35097b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdAttributesFragment.kt */
    @d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment$onViewCreated$1$1", f = "PostAdAttributesFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.postad.extraattributes.PostAdAttributesFragment$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f35098a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f35099b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ PostAdAttributesFragment f35100c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PostAdAttributesFragment postAdAttributesFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f35100c = postAdAttributesFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35100c, aVar);
            anonymousClass1.f35099b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            PostAdViewModel e02;
            lr.a aVar;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f35098a == 0) {
                f.b(obj);
                if (((p) this.f35099b) != null) {
                    PostAdAttributesFragment postAdAttributesFragment = this.f35100c;
                    postAdAttributesFragment.B().S0();
                    Iterator<AttributesGroupItemViewModel> it2 = postAdAttributesFragment.B().L0().iterator();
                    while (it2.hasNext()) {
                        AttributesGroupItemViewModel next = it2.next();
                        o.f(next);
                        e02 = postAdAttributesFragment.e0();
                        AttributesGroupItem attributesGroupItem = new AttributesGroupItem(next, postAdAttributesFragment, e02);
                        aVar = postAdAttributesFragment.K;
                        aVar.n(attributesGroupItem);
                    }
                    postAdAttributesFragment.B().I0();
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAttributesFragment$onViewCreated$1(PostAdAttributesFragment postAdAttributesFragment, zz.a<? super PostAdAttributesFragment$onViewCreated$1> aVar) {
        super(1, aVar);
        this.f35097b = postAdAttributesFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new PostAdAttributesFragment$onViewCreated$1(this.f35097b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35096a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> N0 = this.f35097b.B().N0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f35097b, null);
            this.f35096a = 1;
            if (FlowKt.collectLatest(N0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((PostAdAttributesFragment$onViewCreated$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
