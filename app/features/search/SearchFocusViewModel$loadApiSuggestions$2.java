package com.forsale.app.features.search;

import com.forsale.app.features.search.SearchFocusViewModel;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchFocusViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.SearchFocusViewModel$loadApiSuggestions$2", f = "SearchFocusViewModel.kt", l = {493}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchFocusViewModel$loadApiSuggestions$2 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36746a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SearchFocusViewModel f36747b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f36748c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFocusViewModel$loadApiSuggestions$2(SearchFocusViewModel searchFocusViewModel, String str, zz.a<? super SearchFocusViewModel$loadApiSuggestions$2> aVar) {
        super(2, aVar);
        this.f36747b = searchFocusViewModel;
        this.f36748c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchFocusViewModel$loadApiSuggestions$2(this.f36747b, this.f36748c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AutoCompleteSearchInterActor autoCompleteSearchInterActor;
        Object a11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36746a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
                a11 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            autoCompleteSearchInterActor = this.f36747b.f36708s0;
            String str = this.f36748c;
            this.f36746a = 1;
            a11 = autoCompleteSearchInterActor.a(str, this);
            if (a11 == f11) {
                return f11;
            }
        }
        SearchFocusViewModel searchFocusViewModel = this.f36747b;
        List list = (List) a11;
        searchFocusViewModel.z1(SearchFocusViewModel.SearchState.b(searchFocusViewModel.U0(), null, null, null, null, null, null, false, new SearchFocusViewModel.SearchState.AutoCompleteState(list, SearchFocusViewModel.SearchState.AutoCompleteState.ViewState.Success), null, kotlin.coroutines.jvm.internal.a.d(list.size()), null, 1407, null));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SearchFocusViewModel$loadApiSuggestions$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
