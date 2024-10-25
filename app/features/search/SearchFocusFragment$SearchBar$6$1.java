package com.forsale.app.features.search;

import androidx.compose.ui.focus.FocusRequester;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: SearchFocusFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusFragment$SearchBar$6$1", f = "SearchFocusFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SearchFocusFragment$SearchBar$6$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36681a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FocusRequester f36682b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusFragment$SearchBar$6$1(FocusRequester focusRequester, zz.a<? super SearchFocusFragment$SearchBar$6$1> aVar) {
        super(2, aVar);
        this.f36682b = focusRequester;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusFragment$SearchBar$6$1(this.f36682b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f36681a == 0) {
            kotlin.f.b(obj);
            this.f36682b.e();
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusFragment$SearchBar$6$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
