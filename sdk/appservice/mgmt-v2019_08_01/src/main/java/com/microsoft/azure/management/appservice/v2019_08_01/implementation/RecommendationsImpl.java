/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appservice.v2019_08_01.Recommendations;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.appservice.v2019_08_01.Recommendation;
import com.microsoft.azure.management.appservice.v2019_08_01.RecommendationRule;
import com.microsoft.azure.arm.utils.PagedListConverter;

class RecommendationsImpl extends WrapperImpl<RecommendationsInner> implements Recommendations {
    private PagedListConverter<RecommendationInner, Recommendation> converter;
    private final AppServiceManager manager;

    RecommendationsImpl(AppServiceManager manager) {
        super(manager.inner().recommendations());
        this.manager = manager;
        this.converter = new PagedListConverter<RecommendationInner, Recommendation>() {
            @Override
            public Observable<Recommendation> typeConvertAsync(RecommendationInner inner) {
                return Observable.just((Recommendation) wrapModel(inner));
            }
        };
    }

    public AppServiceManager manager() {
        return this.manager;
    }

    private RecommendationImpl wrapModel(RecommendationInner inner) {
        return  new RecommendationImpl(inner, manager());
    }

    @Override
    public Completable resetAllFiltersAsync() {
        RecommendationsInner client = this.inner();
        return client.resetAllFiltersAsync().toCompletable();
    }

    @Override
    public Completable disableRecommendationForSubscriptionAsync(String name) {
        RecommendationsInner client = this.inner();
        return client.disableRecommendationForSubscriptionAsync(name).toCompletable();
    }

    @Override
    public Observable<Recommendation> listRecommendedRulesForHostingEnvironmentAsync(final String resourceGroupName, final String hostingEnvironmentName) {
        RecommendationsInner client = this.inner();
        return client.listRecommendedRulesForHostingEnvironmentAsync(resourceGroupName, hostingEnvironmentName)
        .flatMapIterable(new Func1<Page<RecommendationInner>, Iterable<RecommendationInner>>() {
            @Override
            public Iterable<RecommendationInner> call(Page<RecommendationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RecommendationInner, Recommendation>() {
            @Override
            public Recommendation call(RecommendationInner inner) {
                return new RecommendationImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable disableAllForHostingEnvironmentAsync(String resourceGroupName, String hostingEnvironmentName, String environmentName) {
        RecommendationsInner client = this.inner();
        return client.disableAllForHostingEnvironmentAsync(resourceGroupName, hostingEnvironmentName, environmentName).toCompletable();
    }

    @Override
    public Completable resetAllFiltersForHostingEnvironmentAsync(String resourceGroupName, String hostingEnvironmentName, String environmentName) {
        RecommendationsInner client = this.inner();
        return client.resetAllFiltersForHostingEnvironmentAsync(resourceGroupName, hostingEnvironmentName, environmentName).toCompletable();
    }

    @Override
    public Observable<RecommendationRule> getRuleDetailsByHostingEnvironmentAsync(String resourceGroupName, String hostingEnvironmentName, String name) {
        RecommendationsInner client = this.inner();
        return client.getRuleDetailsByHostingEnvironmentAsync(resourceGroupName, hostingEnvironmentName, name)
        .map(new Func1<RecommendationRuleInner, RecommendationRule>() {
            @Override
            public RecommendationRule call(RecommendationRuleInner inner) {
                return new RecommendationRuleImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable disableRecommendationForHostingEnvironmentAsync(String resourceGroupName, String name, String hostingEnvironmentName, String environmentName) {
        RecommendationsInner client = this.inner();
        return client.disableRecommendationForHostingEnvironmentAsync(resourceGroupName, name, hostingEnvironmentName, environmentName).toCompletable();
    }

    @Override
    public Observable<Recommendation> listRecommendedRulesForWebAppAsync(final String resourceGroupName, final String siteName) {
        RecommendationsInner client = this.inner();
        return client.listRecommendedRulesForWebAppAsync(resourceGroupName, siteName)
        .flatMapIterable(new Func1<Page<RecommendationInner>, Iterable<RecommendationInner>>() {
            @Override
            public Iterable<RecommendationInner> call(Page<RecommendationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RecommendationInner, Recommendation>() {
            @Override
            public Recommendation call(RecommendationInner inner) {
                return new RecommendationImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable disableAllForWebAppAsync(String resourceGroupName, String siteName) {
        RecommendationsInner client = this.inner();
        return client.disableAllForWebAppAsync(resourceGroupName, siteName).toCompletable();
    }

    @Override
    public Completable resetAllFiltersForWebAppAsync(String resourceGroupName, String siteName) {
        RecommendationsInner client = this.inner();
        return client.resetAllFiltersForWebAppAsync(resourceGroupName, siteName).toCompletable();
    }

    @Override
    public Observable<RecommendationRule> getRuleDetailsByWebAppAsync(String resourceGroupName, String siteName, String name) {
        RecommendationsInner client = this.inner();
        return client.getRuleDetailsByWebAppAsync(resourceGroupName, siteName, name)
        .map(new Func1<RecommendationRuleInner, RecommendationRule>() {
            @Override
            public RecommendationRule call(RecommendationRuleInner inner) {
                return new RecommendationRuleImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable disableRecommendationForSiteAsync(String resourceGroupName, String siteName, String name) {
        RecommendationsInner client = this.inner();
        return client.disableRecommendationForSiteAsync(resourceGroupName, siteName, name).toCompletable();
    }

    @Override
    public PagedList<Recommendation> list() {
        RecommendationsInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<Recommendation> listAsync() {
        RecommendationsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<RecommendationInner>, Iterable<RecommendationInner>>() {
            @Override
            public Iterable<RecommendationInner> call(Page<RecommendationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RecommendationInner, Recommendation>() {
            @Override
            public Recommendation call(RecommendationInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Recommendation> listHistoryForHostingEnvironmentAsync(final String resourceGroupName, final String hostingEnvironmentName) {
        RecommendationsInner client = this.inner();
        return client.listHistoryForHostingEnvironmentAsync(resourceGroupName, hostingEnvironmentName)
        .flatMapIterable(new Func1<Page<RecommendationInner>, Iterable<RecommendationInner>>() {
            @Override
            public Iterable<RecommendationInner> call(Page<RecommendationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RecommendationInner, Recommendation>() {
            @Override
            public Recommendation call(RecommendationInner inner) {
                return new RecommendationImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Recommendation> listHistoryForWebAppAsync(final String resourceGroupName, final String siteName) {
        RecommendationsInner client = this.inner();
        return client.listHistoryForWebAppAsync(resourceGroupName, siteName)
        .flatMapIterable(new Func1<Page<RecommendationInner>, Iterable<RecommendationInner>>() {
            @Override
            public Iterable<RecommendationInner> call(Page<RecommendationInner> page) {
                return page.items();
            }
        })
        .map(new Func1<RecommendationInner, Recommendation>() {
            @Override
            public Recommendation call(RecommendationInner inner) {
                return new RecommendationImpl(inner, manager());
            }
        });
    }

}
