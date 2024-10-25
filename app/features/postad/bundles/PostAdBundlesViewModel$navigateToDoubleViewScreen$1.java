package com.forsale.app.features.postad.bundles;

import com.forsale.app.features.postad.bundles.a;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdBundlesViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.bundles.PostAdBundlesViewModel$navigateToDoubleViewScreen$1", f = "PostAdBundlesViewModel.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdBundlesViewModel$navigateToDoubleViewScreen$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35042a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PostAdBundlesViewModel f35043b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f35044c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f35045d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdBundlesViewModel$navigateToDoubleViewScreen$1(PostAdBundlesViewModel postAdBundlesViewModel, String str, String str2, zz.a<? super PostAdBundlesViewModel$navigateToDoubleViewScreen$1> aVar) {
        super(2, aVar);
        this.f35043b = postAdBundlesViewModel;
        this.f35044c = str;
        this.f35045d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdBundlesViewModel$navigateToDoubleViewScreen$1(this.f35043b, this.f35044c, this.f35045d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Channel channel;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f35042a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            channel = this.f35043b.f35011h;
            a.C0392a c0392a = new a.C0392a(this.f35044c, this.f35045d);
            this.f35042a = 1;
            if (channel.send(c0392a, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdBundlesViewModel$navigateToDoubleViewScreen$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
