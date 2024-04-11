const base = {
    get() {
        return {
            url : "http://localhost:8080/springboots5264/",
            name: "springboots5264",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "超市进销存系统"
        } 
    }
}
export default base
